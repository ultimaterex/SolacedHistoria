package com.rexserubii.solacedhistoria;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class GDXgame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
    Sprite sprite;

	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("MCat.jpg");
		sprite = new Sprite(img);
        sprite.setPosition(Gdx.graphics.getWidth()/2 - sprite.getWidth()/2, Gdx.graphics.getHeight()/2 - sprite.getHeight()/2);

		Music mp3Music = Gdx.audio.newMusic(Gdx.files.internal("Switch-On.mp3"));
		mp3Music.play();
		mp3Music.setVolume(1.0f);
		mp3Music.pause();
		mp3Music.stop();
		mp3Music.play();
		mp3Music.setLooping(true);
		Gdx.app.log("SONG",Float.toString(mp3Music.getPosition()));
	}

	@Override
	public void render () {
        if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){
            sprite.translateX(-5f);
        }
        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
            sprite.translateX(5f);
        }
        if(Gdx.input.isKeyPressed(Input.Keys.UP)){
            sprite.translateY(5f);
        }
        if(Gdx.input.isKeyPressed(Input.Keys.DOWN)){
            sprite.translateY(-5f);
        }
		if(Gdx.input.isButtonPressed(Input.Buttons.RIGHT)) {
			sprite.setPosition(Gdx.input.getX(), Gdx.graphics.getHeight() - Gdx.input.getY());
		}
		if(Gdx.input.isTouched()){
			sprite.setPosition(Gdx.input.getX(), Gdx.graphics.getHeight() - Gdx.input.getY());
		}
		Gdx.graphics.setTitle (String.valueOf(Gdx.graphics.getFramesPerSecond()));


		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(sprite, sprite.getX(), sprite.getY());
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();

	}
}

