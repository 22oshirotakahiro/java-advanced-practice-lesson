package jp.co.axiz.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import jp.co.axiz.app.App;
import jp.co.axiz.app.ClockApp;

class AppUtilTest {
	
	private final App app = new ClockApp();

	// テストメソッド
	/*
	 * @Test public void インスタンスの型テスト() {
	 * 
	 * App app = new CardGameApp(); assertAll( () -> assertTrue(isGameApp(app)), ()
	 * -> assertTrue(isCardGameApp(app)), () -> assertTrue(isDartsGameApp(app)), ()
	 * -> assertTrue(isClockApp(app)), () -> assertEquals(getAppName(app),
	 * "ゲーム：カード") ); }
	 */

	@Test
	public void isGameAppTest() {
		assertTrue(AppUtil.isGameApp(app));
	}

	@Test
	public void isCardGameAppTest() {
		assertTrue(AppUtil.isCardGameApp(app));
	}

	@Test
	public void isDartsGameAppTest() {
		assertTrue(AppUtil.isDartsGameApp(app));
	}

	@Test
	public void isClockAppTest() {
		assertTrue(AppUtil.isClockApp(app));
	}

	@Test
	public void getAppNameTest() {
		assertEquals("時計", AppUtil.getAppName(app));
	}

}
