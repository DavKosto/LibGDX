package ru.geekbrains.sprite;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

import ru.geekbrains.base.Sprite;
import ru.geekbrains.math.Rect;

public class Logo extends Sprite {
    Vector2 v;
    Vector2 endPoint;
    Vector2 buf;
    private static final float V_LEN = 0.01f;

    public Logo(TextureRegion region) {
        super(region);
        v = new Vector2();
        endPoint = new Vector2();
        buf = new Vector2();
    }

    @Override
    public void resize(Rect worldBounds) {
        super.resize(worldBounds);
        setHeightProportion(0.2f);
    }

    @Override
    public void update(float delta) {
        super.update(delta);
        buf.set(endPoint);
        if (buf.sub(pos).len() > V_LEN){
            pos.add(v);
        }else {
            pos.set(endPoint);
        }
    }

    @Override
    public boolean touchDown(Vector2 touch, int pointer, int button) {
        endPoint.set(touch);
        v.set(touch.sub(pos)).setLength(V_LEN);
        return false;
    }
}
