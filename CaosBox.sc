//Main Enviroment init
CaosBox {
	classvar s,url;
	classvar window;

	*enviroment {

		~url = this.filenameSymbol.asString.dirname;

		^super.new.init;

	}

	init {

		s = Server.local;

		s.waitForBoot {


			(~url +/+ "CB/CaosBox-load.scd").load;

			this.gui;

			//debug
			// "Class in development ... Refer to 'CaosBox.scd' to use legacy boot of CaosBox".inform;

		};

	}

	gui {
		//
		// window = Window.new("Test",Rect.aboutPoint(Window.screenBounds.center,512,340),false)
		//
		// ^window.front;

	}

}