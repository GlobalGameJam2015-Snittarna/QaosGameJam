package com.tomnes.dd.gameScene.objects;

import com.badlogic.gdx.math.Vector2;
import com.tomnes.dd.framework.Animation;
import com.tomnes.dd.AssetManager;

public class Bullet extends Projectile {

	public Bullet(Vector2 position, float angle, boolean hitsPlayer) {
		super(position, new Vector2(.2f, .2f), new Animation(AssetManager.getTexture("bullet")), angle, 4, 1, hitsPlayer);
		// TODO Auto-generated constructor stub
	}

}
