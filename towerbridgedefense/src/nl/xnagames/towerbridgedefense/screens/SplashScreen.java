package nl.xnagames.towerbridgedefense.screens;

import nl.xnagames.towerbridgedefense.TowerBridgeDefence;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;

public class SplashScreen implements Screen
{
	//field
	
	private TowerBridgeDefence game;
	
	//properties
	
	
	//constructor
	public SplashScreen(TowerBridgeDefence game)
	{
		this.game = game;
	}
	
	@Override
	public void render(float delta) 
	{
		Gdx.gl.glClearColor(0.5f, 1, 1, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		if (Gdx.input.isKeyPressed(Keys.SPACE))
		{
			this.game.setScreen(this.game.getGameScreen());
		}
		
	}

	@Override
	public void resize(int width, int height) 
	{
		
		
	}

	@Override
	public void show() 
	{
		
		
	}

	@Override
	public void hide() 
	{
		
		
	}

	@Override
	public void pause() 
	{
		
		
	}

	@Override
	public void resume() 
	{
		
		
	}

	@Override
	public void dispose() 
	{
	
		
	}
	
}
