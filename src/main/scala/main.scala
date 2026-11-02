import scala.swing._
import org.apache.spark.sql.{DataFrame, SparkSession}
import org.apache.spark.graphx._


@main
def main(): Unit = {
  Swing.onEDT {
    try {
    val frame = new MainFrame {
      title = "Simulator"
      size = new Dimension(1200, 750)
      centerOnScreen()
    }
    frame.visible = true
    frame.peer.setAlwaysOnTop(true) // bring to front...
    frame.peer.setAlwaysOnTop(false) // ...then behave normally
    frame.peer.toFront()
  } catch {
  case e: Throwable =>
    println("FAILED: " + e)
    e.printStackTrace()
}
}
  
}

