/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.riosoft.mavenproject;

import com.google.gson.Gson;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.handler.TextWebSocketHandler;

/**
 *
 * @author ricardo
 */
public class MyHandler extends TextWebSocketHandler {

    private static final Set<WebSocketSession> peers = Collections.synchronizedSet(new HashSet<WebSocketSession>());

    public void broadcastFigure(TextMessage figure, WebSocketSession session) throws IOException {
        for (WebSocketSession peer : peers) {
            if (!peer.isOpen()) {
                peers.remove(peer);
                System.out.println("Session " + peer.getId() + " eliminada!!");
            } else if (!peer.equals(session)) {
                peer.sendMessage(figure);
            }
        }
    }

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) {
        try {
            System.out.println("Testing " + message.getPayload());
            Gson gson = new Gson();
            Figura figura = gson.fromJson(message.getPayload(), Figura.class);
            System.out.println(figura.toString());
            peers.add(session);
            broadcastFigure(new TextMessage(gson.toJson(figura).getBytes()), session);
        } catch (Exception ex) {
            Logger.getLogger(MyHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
