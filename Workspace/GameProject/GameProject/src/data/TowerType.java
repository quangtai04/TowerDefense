package data;

import static helpers.Artist.*;

import org.newdawn.slick.opengl.Texture;

public enum TowerType {
	TowerNormal(new Texture[] { QuickLoad("Tower"), QuickLoad("NormalGun") },ProjectileType.CannonBall, 10, 240, 3, 25),
	TowerSniper(new Texture[] { QuickLoad("Tower"), QuickLoad("SniperGun") },ProjectileType.CannonBall, 10, 160, 2, 25),
	TowerMachine(new Texture[] { QuickLoad("Tower"), QuickLoad("MachineGun") },ProjectileType.CannonBall, 10, 360, 4, 25);

	Texture[] textures;
	ProjectileType projectileType;
	int damage, range, cost;
	float firingSpeed;
	
	TowerType(Texture[] textures, ProjectileType projectileType, int damage, int range, float firingSpeed, int cost) {
		this.textures = textures;
		this.projectileType = projectileType;
		this.damage = damage;			// hu hai gay ra cho quan dich
		this.range = range;				// pham vi ban
		this.firingSpeed = firingSpeed; //toc do ban
		this.cost = cost;
	}
	
	public String getTowerType()	{
		switch (this) {
		case TowerNormal:
			return "Tower Normal";
		case TowerSniper:
			return "Tower Sniper";
		case TowerMachine:
			return "Tower Machine";
		default:
			break;
		}
		return null;
	}
}
