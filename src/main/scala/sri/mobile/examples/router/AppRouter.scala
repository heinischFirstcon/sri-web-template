package sri.mobile.examples.router

import sri.core.ReactElement
import sri.mobile.examples.components.HelloSriMobile
import sri.universal.components.View
import sri.universal.router._
import sri.universal.styles.UniversalStyleSheet


object AppRouter {

  object HomePage extends StaticPage

  object Config extends UniversalRouterConfig {

    override val initialRoute = defineInitialRoute(HomePage, "Home", HelloSriMobile())

    override val notFound = UniversalRouteNotFound(initialRoute._1)

    override def renderScene(route: NavigatorRoute): ReactElement = {
      View(style = UniversalStyleSheet.wholeContainer)(
        super.renderScene(route)
      )
    }
  }

  val router = UniversalRouter(Config)

}

