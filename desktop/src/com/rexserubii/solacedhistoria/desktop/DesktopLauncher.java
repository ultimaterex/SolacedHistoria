package com.rexserubii.solacedhistoria.desktop;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.rexserubii.solacedhistoria.GDXgame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.fullscreen = false;	//fullscreen default to off
		config.width = 1280;	//setting width and height to 720p minimum
		config.height = 720;
		config.title = "Rex's game";
		new LwjglApplication(new GDXgame(), config);

	}
}

