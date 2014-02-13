package nl.xnagames.towerbridgedefense;

import nl.xnagames.towerbridgedefense.screens.SplashScreen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class TowerBridgeDefence extends Game {	
	
	private SpriteBatch batch;
	private SplashScreen splashScreen;
	
	
	@Override
	public void create() 
	{
		this.splashScreen = new SplashScreen(this);
		this.setScreen(this.splashScreen);
	}

	@Override
	public void dispose() 
	{
		super.dispose();
		this.splashScreen.dispose();
	}

	@Override
	public void render() 
	{		
		Gdx.gl.glClearColor(0.5f, 1, 1, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		super.render();
	}

	@Override
	public void resize(int width, int height) 
	{
		super.resize(width, height);
	}

	@Override
	public void pause() 
	{
		super.pause();
	}

	@Override
	public void resume() 
	{
		super.resume();
	}
}
