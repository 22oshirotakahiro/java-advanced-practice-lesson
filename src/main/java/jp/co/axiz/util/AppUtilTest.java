package jp.co.axiz.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import app.App;
import app.CardGameApp;
import app.ClockApp;
import app.DartsGameApp;
import app.GameApp;

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
	public void isGameApp() {
		assertTrue(app instanceof GameApp);
	}

	@Test
	public void isCardGameApp() {
		assertTrue(app instanceof CardGameApp);
	}

	@Test
	public void isDartsGameApp() {
		assertTrue(app instanceof DartsGameApp);
	}

	@Test
	public void isClockApp() {
		assertTrue(app instanceof ClockApp);
	}

	@Test
	public void getAppName() {
		String appName = "";
		if (app instanceof CardGameApp) {
			appName = "ゲーム：カード";
		} else if (app instanceof DartsGameApp) {
			appName = "ゲーム：ダーツ";
		} else if (app instanceof ClockApp) {
			appName = "時計";
		}
		assertEquals("時計", appName);
	}

}
