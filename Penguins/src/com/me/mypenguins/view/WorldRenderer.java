package com.me.mypenguins.view;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.me.mypenguins.model.GameWorld;

public class WorldRenderer {
	private GameWorld w;
	private boolean debug;
	private Box2DDebugRenderer debugRenderer;

	private OrthographicCamera cam;

	public WorldRenderer(GameWorld w, boolean debug){
		this.w = w;
		this.debug = debug;
		debugRenderer = new Box2DDebugRenderer();
		cam = new OrthographicCamera(100, 100);//eventually change the arguments to be based on gameworld's dimensions maybe
		cam.position.set(50, 50, 0);//would need to be changed too
		cam.update();
		
	}
	
	public void render(){
		if(debug && w != null){
			debugRenderer.render(w.getWorld(), cam.combined);
		}
	}
}
