package ru.geekbrains.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

import ru.geekbrains.base.BaseScreen;

public class MenuScreen extends BaseScreen {

    private Texture img;
    private Texture background;
    private Vector2 pos;
    private Vector2 v;
    private Vector2 tempVector;
    private float myScreenX;
    private float myScreenY;
    private float cordX;
    private float cordY;

    @Override
    public void show() {
        super.show();
        background = new Texture("textures/bg.png");
        img = new Texture("star.jpg");
        pos = new Vector2();
        v = new Vector2();
        tempVector = new Vector2();
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        Gdx.gl.glClearColor(0.2f, 	0.6f, 0.5f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        batch.draw(background, 0, 0);
        batch.draw(img, pos.x, pos.y);
        batch.end();
        addVector();
    }

    @Override
    public void dispose() {
        img.dispose();
        background.dispose();
        super.dispose();
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        System.out.println("touchDown screenX = " + screenX + " screenY = " + screenY);
        tempVector.set(screenX, Gdx.graphics.getHeight() - screenY);
        agg();
        return false;
    }

    public void agg(){
        System.out.println("PosX = " + pos.x);
        System.out.println("PosY = " + pos.y);
        System.out.println("TempX = " + tempVector.x);
        System.out.println("TempY = " + tempVector.y);
        myScreenX = tempVector.x - pos.x;
        System.out.println("myScreenX = " + myScreenX);
        myScreenY = tempVector.y - pos.y;
        System.out.println("myScreenY = " + myScreenY);
        cordX = (float) (myScreenX*0.1);
        System.out.println("cordX = " + cordX);
        cordY = (float) (myScreenY*0.1);
        System.out.println("cordY = " + cordY);
    }

    public void addVector(){
            if ((pos.x != tempVector.x && pos.y != tempVector.y) ) {
            pos.add(cordX, cordY);
        }
    }
}
