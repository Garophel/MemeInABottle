package com.Mrbysco.MIAB.entity.monsters;

import com.Mrbysco.MIAB.entity.monsters.models.ModelBill;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderBill extends RenderLiving<EntityBill> {
	
	  public static final Factory FACTORY = new Factory();
	  
	  private static final ResourceLocation texture = new ResourceLocation("miab:entity/BillCipher.png");

	  public RenderBill(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelBill(), 0.5F);
	  }

	  @Override
	  protected ResourceLocation getEntityTexture(EntityBill entity) {
	    return texture;
	  }

	  public static class Factory implements IRenderFactory<EntityBill> {

	    @Override
	    public Render<? super EntityBill> createRenderFor(RenderManager manager) {
	      return new RenderBill(manager);
	    }
	  }
	  
	}