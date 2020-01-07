package ru.geekbrains.screen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

import ru.geekbrains.base.BaseScreen;
import ru.geekbrains.math.Rect;
import ru.geekbrains.sprite.Background;
import ru.geekbrains.sprite.ButtonExit;
import ru.geekbrains.sprite.ButtonPlay;
<<<<<<< HEAD
<<<<<<< HEAD
=======
import ru.geekbrains.sprite.Ship;
>>>>>>> a9b25945ad7addeb96f226f23b5ab4bca2177301
=======
import ru.geekbrains.sprite.Ship;
>>>>>>> a9b25945ad7addeb96f226f23b5ab4bca2177301
import ru.geekbrains.sprite.Star;

public class MenuScreen extends BaseScreen {

    private Game game;

    private Texture bg;
<<<<<<< HEAD
<<<<<<< HEAD
    private TextureAtlas atlas;
=======
    private TextureAtlas menuAtlas;
>>>>>>> a9b25945ad7addeb96f226f23b5ab4bca2177301
=======
    private TextureAtlas menuAtlas;
>>>>>>> a9b25945ad7addeb96f226f23b5ab4bca2177301

    private Background background;
    private ButtonExit buttonExit;
    private ButtonPlay buttonPlay;
<<<<<<< HEAD
<<<<<<< HEAD
=======
    private Ship mainShip;
>>>>>>> a9b25945ad7addeb96f226f23b5ab4bca2177301
=======
    private Ship mainShip;
>>>>>>> a9b25945ad7addeb96f226f23b5ab4bca2177301
    private Star[] stars;

    public MenuScreen(Game game) {
        this.game = game;
    }

    @Override
    public void show() {
        super.show();
        bg = new Texture("textures/bg.png");
        background = new Background(new TextureRegion(bg));
<<<<<<< HEAD
<<<<<<< HEAD
        atlas = new TextureAtlas(Gdx.files.internal("textures/menuAtlas.tpack"));
        buttonExit = new ButtonExit(atlas);
        buttonPlay = new ButtonPlay(atlas, game);
        stars = new Star[256];
        for (int i = 0; i < stars.length; i++) {
            stars[i] = new Star(atlas);
=======
=======
>>>>>>> a9b25945ad7addeb96f226f23b5ab4bca2177301
        menuAtlas = new TextureAtlas(Gdx.files.internal("textures/menuAtlas.tpack"));
        buttonExit = new ButtonExit(menuAtlas);
        buttonPlay = new ButtonPlay(menuAtlas, game);

        stars = new Star[64];
        for (int i = 0; i < stars.length; i++) {
            stars[i] = new Star(menuAtlas);
<<<<<<< HEAD
>>>>>>> a9b25945ad7addeb96f226f23b5ab4bca2177301
=======
>>>>>>> a9b25945ad7addeb96f226f23b5ab4bca2177301
        }
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        update(delta);
        draw();
    }

    @Override
    public void dispose() {
<<<<<<< HEAD
<<<<<<< HEAD
        atlas.dispose();
=======
        menuAtlas.dispose();
>>>>>>> a9b25945ad7addeb96f226f23b5ab4bca2177301
=======
        menuAtlas.dispose();
>>>>>>> a9b25945ad7addeb96f226f23b5ab4bca2177301
        bg.dispose();
        super.dispose();
    }

    @Override
    public void resize(Rect worldBounds) {
        super.resize(worldBounds);
        background.resize(worldBounds);
        buttonExit.resize(worldBounds);
        buttonPlay.resize(worldBounds);
        for (Star star : stars) {
            star.resize(worldBounds);
        }
    }

    @Override
    public boolean touchDown(Vector2 touch, int pointer, int button) {
        buttonExit.touchDown(touch, pointer, button);
        buttonPlay.touchDown(touch, pointer, button);
        return false;
    }

    @Override
    public boolean touchUp(Vector2 touch, int pointer, int button) {
        buttonExit.touchUp(touch, pointer, button);
        buttonPlay.touchUp(touch, pointer, button);
        return false;
    }

    private void update(float delta) {
        for (Star star : stars) {
            star.update(delta);
        }
    }

    private void draw() {
        Gdx.gl.glClearColor(0.2f, 	0.6f, 0.5f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        background.draw(batch);
        for (Star star : stars) {
            star.draw(batch);
        }
        buttonExit.draw(batch);
        buttonPlay.draw(batch);
        batch.end();
    }
}
