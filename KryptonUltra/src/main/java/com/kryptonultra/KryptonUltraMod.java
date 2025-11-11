package com.kryptonultra;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
@Mod(modid="kryptonultra", name="Krypton Ultra", version="1.0")
public class KryptonUltraMod {
  @Mod.EventHandler
  public void init(FMLInitializationEvent e) {
    System.out.println("Krypton Ultra loaded successfully!");
  }
}
