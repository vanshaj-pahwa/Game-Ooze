package com.flappybird.controller;

import com.flappybird.model.Bird;
import java.awt.event.KeyEvent;
/**
 *
 * @author vanshaj
 */
public class Controller implements IStrategy {

    @Override
    public void controller(Bird bird, KeyEvent kevent) {
    }

    @Override
    public void controllerReleased(Bird bird, KeyEvent kevent) {
        if(kevent.getKeyCode() == KeyEvent.VK_SPACE || kevent.getKeyCode() == KeyEvent.VK_UP) {
            bird.jump();
        }
    }
}
