/*
 * Pixel Dungeon
 * Copyright (C) 2012-2014  Oleg Dolya
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */
package com.shatteredpixel.shatteredpixeldungeon.ui;

import com.watabou.noosa.Image;
import com.shatteredpixel.shatteredpixeldungeon.Assets;
import com.shatteredpixel.shatteredpixeldungeon.actors.hero.HeroClass;

public enum Icons {

	SKULL,
	BUSY,
	COMPASS,
	INFO, 
	PREFS,
	WARNING,
	TARGET,
	MASTERY,
	WATA,
	WARRIOR,
	MAGE,
	ROGUE,
	HUNTRESS,
	CLOSE,
	DEPTH,
	SLEEP,
	ALERT,
	SUPPORT,
	SUPPORTED,
	BACKPACK,
	SEED_POUCH,
	SCROLL_HOLDER,
	WAND_HOLSTER,
	CHECKED,
	UNCHECKED;
	
	public Image get() {
		return get( this );
	}
	
	public static Image get( Icons type ) {
		Image icon = new Image( Assets.ICONS );
		switch (type) {
		case SKULL:
			icon.frame( icon.texture.uvRect( 0, 0, 8, 8 ) );
			break;
		case BUSY:
			icon.frame( icon.texture.uvRect( 8, 0, 16, 8 ) );
			break;
		case COMPASS:
			icon.frame( icon.texture.uvRect( 0, 8, 7, 13 ) );
			break;
		case INFO:
			icon.frame( icon.texture.uvRect( 16, 0, 30, 14 ) );
			break;
		case PREFS:
			icon.frame( icon.texture.uvRect( 30, 0, 46, 16 ) );
			break;
		case WARNING:
			icon.frame( icon.texture.uvRect( 46, 0, 58, 12 ) );
			break;
		case TARGET:
			icon.frame( icon.texture.uvRect( 0, 13, 16, 29 ) );
			break;
		case MASTERY:
			icon.frame( icon.texture.uvRect( 16, 14, 30, 28 ) );
			break;
		case WATA:
			icon.frame( icon.texture.uvRect( 30, 16, 45, 26 ) );
			break;
		case WARRIOR:
			icon.frame( icon.texture.uvRect( 0, 29, 16, 45 ) );
			break;
		case MAGE:
			icon.frame( icon.texture.uvRect( 16, 29, 32, 45 ) );
			break;
		case ROGUE:
			icon.frame( icon.texture.uvRect( 32, 29, 48, 45 ) );
			break;
		case HUNTRESS:
			icon.frame( icon.texture.uvRect( 48, 29, 64, 45 ) );
			break;
		case CLOSE:
			icon.frame( icon.texture.uvRect( 0, 45, 13, 58 ) );
			break;
		case DEPTH:
			icon.frame( icon.texture.uvRect( 45, 12, 54, 20 ) );
			break;
		case SLEEP:
			icon.frame( icon.texture.uvRect( 13, 45, 22, 53 ) );
			break;
		case ALERT:
			icon.frame( icon.texture.uvRect( 22, 45, 30, 53 ) );
			break;
		case SUPPORT:
			icon.frame( icon.texture.uvRect( 30, 45, 46, 61 ) );
			break;
		case SUPPORTED:
			icon.frame( icon.texture.uvRect( 46, 45, 62, 61 ) );
			break;
		case BACKPACK:
			icon.frame( icon.texture.uvRect( 58, 0, 68, 10 ) );
			break;
		case SCROLL_HOLDER:
			icon.frame( icon.texture.uvRect( 68, 0, 78, 10 ) );
			break;
		case SEED_POUCH:
			icon.frame( icon.texture.uvRect( 78, 0, 88, 10 ) );
			break;
		case WAND_HOLSTER:
			icon.frame( icon.texture.uvRect( 88, 0, 98, 10 ) );
			break;
		case CHECKED:
			icon.frame( icon.texture.uvRect( 54, 12, 66, 24 ) );
			break;
		case UNCHECKED:
			icon.frame( icon.texture.uvRect( 66, 12, 78, 24 ) );
			break;
		}
		return icon;
	}
	
	public static Image get( HeroClass cl ) {
		switch (cl) {
		case WARRIOR:
			return get( WARRIOR );
		case MAGE:
			return get( MAGE );
		case ROGUE:
			return get( ROGUE );
		case HUNTRESS:
			return get( HUNTRESS );
		default:
			return null;
		}
	}
}