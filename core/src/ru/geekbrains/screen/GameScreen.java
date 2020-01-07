package ru.geekbrains.screen;

import com.badlogic.gdx.Gdx;
<<<<<<< HEAD
<<<<<<< HEAD
import com.badlogic.gdx.audio.Music;
=======
>>>>>>> a9b25945ad7addeb96f226f23b5ab4bca2177301
=======
>>>>>>> a9b25945ad7addeb96f226f23b5ab4bca2177301
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

import ru.geekbrains.base.BaseScreen;
import ru.geekbrains.math.Rect;
<<<<<<< HEAD
<<<<<<< HEAD
import ru.geekbrains.pool.BulletPool;
import ru.geekbrains.sprite.Background;
import ru.geekbrains.sprite.MainShip;
=======
import ru.geekbrains.sprite.Background;
import ru.geekbrains.sprite.Ship;
>>>>>>> a9b25945ad7addeb96f226f23b5ab4bca2177301
=======
import ru.geekbrains.sprite.Background;
import ru.geekbrains.sprite.Ship;
>>>>>>> a9b25945ad7addeb96f226f23b5ab4bca2177301
import ru.geekbrains.sprite.Star;

public class GameScreen extends BaseScreen {

    private Texture bg;
<<<<<<< HEAD
<<<<<<< HEAD
    private TextureAtlas atlas;

    private Background background;
    private Star[] stars;

    private MainShip mainShip;

    private BulletPool bulletPool;
    private Music music;

=======
=======
>>>>>>> a9b25945ad7addeb96f226f23b5ab4bca2177301
    private TextureAtlas menuAtlas;
    private TextureAtlas mainAtlas;

    private Background background;
    private Ship mainShip;
    private Star[] stars;

<<<<<<< HEAD
>>>>>>> a9b25945ad7addeb96f226f23b5ab4bca2177301
=======
>>>>>>> a9b25945ad7addeb96f226f23b5ab4bca2177301
    @Override
    public void show() {
        super.show();
        bg = new Texture("textures/bg.png");
        background = new Background(new TextureRegion(bg));
<<<<<<< HEAD
<<<<<<< HEAD
        atlas = new TextureAtlas(Gdx.files.internal("textures/mainAtlas.tpack"));


        stars = new Star[64];
        for (int i = 0; i < stars.length; i++) {
            stars[i] = new Star(atlas);
        }
        bulletPool = new BulletPool();
        mainShip = new MainShip(atlas, bulletPool);
        music = Gdx.audio.newMusic(Gdx.files.internal("sounds/music.mp3"));
        music.setVolume(2f);
        music.setLooping(true);
        music.play();
    }

=======
=======
>>>>>>> a9b25945ad7addeb96f226f23b5ab4bca2177301
        menuAtlas = new TextureAtlas(Gdx.files.internal("textures/menuAtlas.tpack"));
        mainAtlas = new TextureAtlas(Gdx.files.internal("textures/mainAtlas.tpack"));
        mainShip = new Ship(mainAtlas);
        stars = new Star[256];
        for (int i = 0; i < stars.length; i++) {
            stars[i] = new Star(menuAtlas);
        }
    }


<<<<<<< HEAD
>>>>>>> a9b25945ad7addeb96f226f23b5ab4bca2177301
=======
>>>>>>> a9b25945ad7addeb96f226f23b5ab4bca2177301
    @Override
    public void render(float delta) {
        super.render(delta);
        update(delta);
<<<<<<< HEAD
<<<<<<< HEAD
        freeAllDestroyed();
=======
>>>>>>> a9b25945ad7addeb96f226f23b5ab4bca2177301
=======
>>>>>>> a9b25945ad7addeb96f226f23b5ab4bca2177301
        draw();
    }

    @Override
    public void resize(Rect worldBounds) {
        super.resize(worldBounds);
        background.resize(worldBounds);
<<<<<<< HEAD
<<<<<<< HEAD
        for (Star star : stars) {
            star.resize(worldBounds);
        }
        mainShip.resize(worldBounds);
=======
=======
>>>>>>> a9b25945ad7addeb96f226f23b5ab4bca2177301
        mainShip.resize(worldBounds);
        for (Star star : stars) {
            star.resize(worldBounds);
        }
<<<<<<< HEAD
>>>>>>> a9b25945ad7addeb96f226f23b5ab4bca2177301
=======
>>>>>>> a9b25945ad7addeb96f226f23b5ab4bca2177301
    }

    @Override
    public void dispose() {
<<<<<<< HEAD
<<<<<<< HEAD
        atlas.dispose();
        bg.dispose();
        bulletPool.dispose();
        mainShip.dispose();
        music.dispose();
=======
        menuAtlas.dispose();
        bg.dispose();
>>>>>>> a9b25945ad7addeb96f226f23b5ab4bca2177301
=======
        menuAtlas.dispose();
        bg.dispose();
>>>>>>> a9b25945ad7addeb96f226f23b5ab4bca2177301
        super.dispose();
    }

    @Override
    public boolean touchDown(Vector2 touch, int pointer, int button) {
        mainShip.touchDown(touch, pointer, button);
        return false;
    }

    @Override
    public boolean touchUp(Vector2 touch, int pointer, int button) {
        mainShip.touchUp(touch, pointer, button);
        return false;
    }

<<<<<<< HEAD
<<<<<<< HEAD
    @Override
    public boolean keyDown(int keycode) {
        mainShip.keyDown(keycode);
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        mainShip.keyUp(keycode);
        return false;
    }

    private void update(float delta) {
        for (Star star : stars) {
            star.update(delta);
        }
        mainShip.update(delta);
        bulletPool.updateActiveSprites(delta);
    }

    private void freeAllDestroyed() {
        bulletPool.freeAllDestroyedActiveObjects();
=======
=======
>>>>>>> a9b25945ad7addeb96f226f23b5ab4bca2177301
    private void update(float delta) {
        mainShip.update(delta);
        for (Star star : stars) {
            star.update(delta);
        }
<<<<<<< HEAD
>>>>>>> a9b25945ad7addeb96f226f23b5ab4bca2177301
=======
>>>>>>> a9b25945ad7addeb96f226f23b5ab4bca2177301
    }

    private void draw() {
        Gdx.gl.glClearColor(0.2f, 	0.6f, 0.5f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        background.draw(batch);
        for (Star star : stars) {
            star.draw(batch);
        }
        mainShip.draw(batch);
<<<<<<< HEAD
<<<<<<< HEAD
        bulletPool.drawActiveSprites(batch);
=======
>>>>>>> a9b25945ad7addeb96f226f23b5ab4bca2177301
=======
>>>>>>> a9b25945ad7addeb96f226f23b5ab4bca2177301
        batch.end();
    }
}
