package app;

 interface AppUtil {
	
	static boolean isGameApp(App app) {
		return app instanceof GameApp;
	}
	
	static boolean isCardGameApp(App app) {
		return app instanceof CardGameApp;
	}
	
	static boolean isDartsGameApp(App app) {
		return app instanceof DartsGameApp;
	}
	
	static boolean isClockApp(App app) {
		return app instanceof ClockApp;
	}
	
	static String getAppName(App app) {
		String appName = "";
		if (app instanceof CardGameApp) {
			appName = "ゲーム：カード";
		} else if (app instanceof DartsGameApp) {
			appName = "ゲーム：ダーツ";
		} else if (app instanceof ClockApp) {
			appName = "時計";
		}
		return appName;
	}
	
}