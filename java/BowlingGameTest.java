import junit.framework.TestCase;

public class BowlingGameTest extends TestCase {
  private Game g;

  protected void setUp() throws Exception {
    g = new Game();
  }
  
  private void rollMany(int n, int pins) {
    for (int i = 0; i < n; i++)
      g.roll(pins);
  }
  
  public void testGutterGame() throws Exception {
    rollMany(20, 0);
    assertEquals(0, g.score());
  }

  public void testAllOnes() throws Exception {
    rollMany(20,1);
    assertEquals(20, g.score());
  }
}
