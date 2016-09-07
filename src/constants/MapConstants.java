package constants;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import client.MapleClient;
import server.maps.MapleMapObjectType;
import tools.packet.CField;

/**
*
* @author SharpAceX (Alan)
*/

public class MapConstants {

	public static final List<MapleMapObjectType> rangedMapobjectTypes = Collections.unmodifiableList(Arrays.asList(
	MapleMapObjectType.ITEM,
	MapleMapObjectType.MONSTER,
	MapleMapObjectType.DOOR,
	MapleMapObjectType.REACTOR,
	MapleMapObjectType.SUMMON,
	MapleMapObjectType.NPC,
	MapleMapObjectType.MIST,
	MapleMapObjectType.FAMILIAR,
	MapleMapObjectType.EXTRACTOR));
	
	public static final int JAIL = 180000004;
	
	public static final int[] hyperTele = {10000, 20000, 30000, 40000, 50000, 1000000, 1010000, 1020000, 2000000, //Maple Island
			104000000, 104010000, 104010100, 104010200, 104020000, 103010100, 103010000, 103000000, 103050000, 103020000, 103020020, 103020100, 103020200, 103020300, 103020310, 103020320, 103020400, 103020410, 103020420, 103030000, 103030100, 103030200, 103030300, 103030400, 102000000, 102010000, 102010100, 102020000, 102020100, 102020200, 102020300, 102020400, 102020500, 102040000, 102040100, 102040200, 102040300, 102040400, 102040500, 102040600, 102030000, 102030100, 102030200, 102030300, 102030400, 101000000, 101010000, 101010100, 101020000, 101020100, 101020200, 101020300, 101030000, 101030100, 101030200, 101030300, 101030400, 101030500, 101030101, 101030201, 101040000, 101040100, 101040200, 101040300, 101040310, 101040320, 101050000, 101050400, 100000000, 100010000, 100010100, 100020000, 100020100, 100020200, 100020300, 100020400, 100020500, 100020401, 100020301, 100040000, 100040100, 100040200, 100040300, 100040400, 100020101, 106020000, 120010100, 120010000, 120000000, 120020000, 120020100, 120020200, 120020300, 120020400, 120020500, 120020600, 120020700, 120030000, 120030100, 120030200, 120030300, 120030400, 120030500, //Victoria Island
			105000000, 105010000, 105010100, 105020000, 105020100, 105020200, 105020300, 105020400, 105020500, 105030000, 105030100, 105030200, 105030300, 105030400, 105030500, 105100000, 105100100, //Sleepy Wood
			120000100, 120000101, 120000102, 120000103, 120000104, 120000201, 120000202, 120000301, //Nautilus
			103040000, 103040100, 103040101, 103040102, 103040103, 103040200, 103040201, 103040202, 103040203, 103040300, 103040301, 103040302, 103040303, 103040400, //Kerning Square
			200000000, 200010000, 200010100, 200010110, 200010120, 200010130, 200010111, 200010121, 200010131, 200010200, 200010300, 200010301, 200010302, 200020000, 200030000, 200040000, 200050000, 200060000, 200070000, 200080000, 200000100, 200000200, 200000300, 200100000, 200080100, 200080200, 200081500, 200082200, 200082300, 211000000, 211000100, 211000200, 211010000, 211020000, 211030000, 211040000, 211050000, 211040100, 211040200, 921120000, //Orbis
			211040300, 211040400, 211040500, 211040600, 211040700, 211040800, 211040900, 211041000, 211041100, 211041200, 211041300, 211041400, 211041500, 211041600, 211041700, 211041800, 211041900, 211042000, 211042100, 211042200, 211042300, 211042400, 280030000, 211060000, //Dead Mine
			211060010, 211060100, 211060200, 211060201, 211060300, 211060400, 211060401, 211060410, 211060500, 211060600, 211060601, 211060610, 211060620, 211060700, 211060800, 211060801, 211060810, 211060820, 211060830, 211060900, 211061000, 211061001, 211070000, //Lion King's Castle
			220000000, 220000100, 220000300, 220000400, 220000500, 220010000, 220010100, 220010200, 220010300, 220010400, 220010500, 220010600, 220010700, 220010800, 220010900, 220011000, 220020000, 220020100, 220020200, 220020300, 220020400, 220020500, 220020600, 220030100, 220030200, 220030300, 220030400, 220030000, 220040000, 220040100, 220040200, 220040300, 220040400, 220050000, 220050100, 220050200, 221023200, 221022300, 221022200, 221021700, 221021600, 221021100, 221020000, 221000000, 221030000, 221030100, 221030200, 221030300, 221030400, 221030500, 221030600, 221040000, 221040100, 221040200, 221040300, 221040400, 222000000, 222010000, 222010001, 222010002, 222010100, 222010101, 222010102, 222010200, 222010201, 222010300, 222010400, 222020300, 222020200, 222020100, 222020000, //Ludas Lake
			220050300, 220060000, 220060100, 220060200, 220060300, 220060400, 220070000, 220070100, 220070200, 220070300, 220070400, 220080000, 220080001, //Clock Tower Lower Floor
			300000100, 300000000, 300010000, 300010100, 300010200, 300010400, 300020000, 300020100, 300020200, 300030000, 300030100, 300010410, 300020210, 300030200, 300030300, 300030310, //Ellin Forest
			230010000, 230010100, 230010200, 230010201, 230010300, 230010400, 230020000, 230020100, 230020200, 230020201, 230020300, 230030000, 230030100, 230030101, 230030200, 230040000, 230040100, 230040200, 230040300, 230040400, 230040410, 230040420, 230000000, //Aqua Road
			250000000, 250000100, 250010000, 250010100, 250010200, 250010300, 250010301, 250010302, 250010303, 250010304, 250010400, 250010500, 250010501, 250010502, 250010503, 250010600, 250010700, 250020000, 250020100, 250020200, 250020300, 251000000, 251000100, 251010000, 251010200, 251010300, 251010400, 251010401, 251010402, 251010403, 251010500, //Mu Lung Garden
			240010100, 240010200, 240010300, 240010400, 240010500, 240010600, 240010700, 240010800, 240010900, 240011000, 240020000, 240020100, 240020101, 240020200, 240020300, 240020400, 240020401, 240020500, 240030000, 240030100, 240030101, 240030102, 240030200, 240030300, 240040000, 240040100, 240040200, 240040300, 240040400, 240040500, 240040510, 240040511, 240040520, 240040521, 240040600, 240040700, 240050000, 240010000, 240000000, //Minar Forest
			240070000, 240070010, 240070100, 240070200, 240070300, 240070400, 240070500, 240070600, //Neo City
			260010000, 260010100, 260010200, 260010300, 260010400, 260010500, 260010600, 260010700, 260020000, 260020100, 260020200, 260020300, 260020400, 260020500, 260020600, 260020610, 260020620, 260020700, 261000000, 260000000, 926010000, 261010000, 261010001, 261010002, 261010003, 261010100, 261010101, 261010102, 261010103, 261020000, 261020100, 261020200, 261020300, 261020400, 261020500, 261020600, 261020700, 260000300, 260000200, //Nihal Desert
			270000000, 270000100, 270010000, 270010100, 270010110, 270010111, 270010200, 270010210, 270010300, 270010310, 270010400, 270010500, 270020000, 270020100, 270020200, 270020210, 270020211, 270020300, 270020310, 270020400, 270020410, 270020500, 270030000, 270030100, 270030110, 270030200, 270030210, 270030300, 270030310, 270030400, 270030410, 270030411, 270030500, 270040000, 270050000, //Temple of Time
			271000000, 271000100, 271000200, 271000210, 271000300, 271020000, 271020100, 271010000, 271010100, 271010200, 271010300, 271010301, 271010400, 271010500, 271030000, 271030100, 271030101, 271030102, 271030200, 271030201, 271030300, 271030310, 271030320, 271030400, 271030410, 271030500, 271030510, 271030520, 271030530, 271030540, 271030600, 271040000, 271040100, //Gate of Future
			130000000, 130000100, 130000110, 130000120, 130000200, 130000210, 130010000, 130010010, 130010020, 130010100, 130010110, 130010120, 130010200, 130010210, 130010220, 130020000, 130030005, 130030006, 130030000, //Ereve
			140000000, 140010000, 140010100, 140010200, 140020000, 140020100, 140020200, 140030000, 140090000, 140020300, //Rien
			310000000, 310000010, 310020000, 310020100, 310020200, 310030000, 310030100, 310030110, 310030200, 310030300, 310030310, 310040000, 310040100, 310040110, 310040200, 310040300, 310040400, 310050000, 310050100, 310050200, 310050300, 310050400, 310050500, 310050510, 310050520, 310050600, 310050700, 310050800, 310060000, 310060100, 310060110, 310060120, 310060200, 310060210, 310060220, 310060300, 310010000, //Edelstein
			600000000, 600010100, 600010200, 600010300, 600010400, 600010500, 600010600, 600010700, 600020000, 600020100, 600020200, 600020300, 600020400, 600020500, 600020600, 682000000, 610010000, 610010001, 610010002, 610010004, 610020000, 610020001, 610020006, 610040000, 610040100, 610040200, 610040210, 610040220, 610040230, 610040400//Masteria
	};
	
	public static boolean isFmMap(int map){
		return map >= 910000001 && map < 910000022;
	}

	public static boolean isAzwanMap(int mapId) {
		return mapId >= 262020000 && mapId < 262023000;
	}

	public static boolean isHyperTeleMap(int mapId) {
		for (int i : MapConstants.hyperTele) {
			if (i == mapId) {
				return true;
			}
		}
		return false;
	}

	public static boolean isFishingMap(int mapid) {
		return mapid == 749050500 || mapid == 749050501 || mapid == 749050502 || mapid == 970020000 || mapid == 970020005;
	}

	public static boolean isStartingEventMap(final int mapid) {
		switch (mapid) {
		case 109010000:
		case 109020001:
		case 109030001:
		case 109030101:
		case 109030201:
		case 109030301:
		case 109030401:
		case 109040000:
		case 109060001:
		case 109060002:
		case 109060003:
		case 109060004:
		case 109060005:
		case 109060006:
		case 109080000:
		case 109080001:
		case 109080002:
		case 109080003:
			return true;
		}
		return false;
	}

	public static boolean isEventMap(final int mapid) {
		return (mapid >= 109010000 && mapid < 109050000) || (mapid > 109050001 && mapid < 109090000) || (mapid >= 809040000 && mapid <= 809040100);
	}

	public static boolean isCoconutMap(final int mapid) {
		return mapid == 109080000 || mapid == 109080001 || mapid == 109080002 || mapid == 109080003 || mapid == 109080010 || mapid == 109080011 || mapid == 109080012 || mapid == 109090300 || mapid == 109090301 || mapid == 109090302 || mapid == 109090303 || mapid == 109090304 || mapid == 910040100;
	}

	public static boolean isTeamMap(final int mapid) {
		return mapid == 109080000 || mapid == 109080001 || mapid == 109080002 || mapid == 109080003 || mapid == 109080010 || mapid == 109080011 || mapid == 109080012 || mapid == 109090300 || mapid == 109090301 || mapid == 109090302 || mapid == 109090303 || mapid == 109090304 || mapid == 910040100 || mapid == 960020100 || mapid == 960020101 || mapid == 960020102 || mapid == 960020103 || mapid == 960030100 || mapid == 689000000 || mapid == 689000010;
	}

	public static boolean isAnyDropMap(int mapId) {
		switch (mapId) {
		case 180000000:
		case 180000001:
			return true;
		}
		return false;
	}

	public static boolean isNoExpireMap(int mapId) {
		switch (mapId) {
		case 180000000:
		case 180000001:
			return true;
		}
		return false;
	}

	public static boolean isTutorialMap(int mapid) {
		if (mapid < 100000000) { //Explorer & Cannoneer
			return true;
		} else if (mapid / 100 == 1030509) { //Dual Blade
			return true;
		} else if (mapid / 10000 == 13003) { //Cygnus
			return true;
		} else if (mapid / 100000 == 9000) { //Evan
			return true;
		} else if (mapid / 10000 == 91015) { //Mercedes
			return true;
		} else if (mapid / 10000 == 91307) { //Mihile
			return true;
		} else if (mapid / 10000 == 91400) { //Aran
			return true;
		} else if (mapid / 10000 == 91500) { //Phantom
			return true;
		} else if (mapid / 10000 == 93100) { //Resistance
			return true;
		} else if (mapid / 10000 == 93105) { //Demon Slayer
			return true;
		}
		return false;
		//There might be included other maps like main town or job advancements,
		//But we don't care since you don't get much exp here and you're locked on teasers.
	}

	public static boolean isForceRespawn(int mapid) {
		switch (mapid) {
		case 103000800: //kerning PQ crocs
		case 925100100: //crocs and stuff
			return true;
		default:
			return mapid / 100000 == 9800 && (mapid % 10 == 1 || mapid % 1000 == 100);
		}
	}

	public static boolean isNoSpawn(int mapID) {
		return mapID == 809040100 || mapID == 925020010 || mapID == 925020011 || mapID == 925020012 || mapID == 925020013 || mapID == 925020014 || mapID == 682020000 || mapID == 980010000 || mapID == 980010100 || mapID == 980010200 || mapID == 980010300 || mapID == 980010020;
	}

	public static boolean isDojo(int mapId) {
		return mapId >= 925020100 && mapId <= 925023814;
	}

	public static int getPartyPlay(int mapId) {
		switch (mapId) {
		case 300010000:
		case 300010100:
		case 300010200:
		case 300010300:
		case 300010400:
		case 300020000:
		case 300020100:
		case 300020200:
		case 300030000:
	
		case 683070400:
		case 683070401:
		case 683070402:
			return 25;
		}
		return 0;
	}

	public static int getPartyPlay(int mapId, int def) {
		int dd = getPartyPlay(mapId);
		if (dd > 0) {
			return dd;
		}
		return def / 2;
	}

	public static void achievementRatio(MapleClient c) {
		//PQs not affected: Amoria, MV, CWK, English, Zakum, Horntail(?), Carnival, Ghost, Guild, LudiMaze, Elnath(?) 
		switch (c.getPlayer().getMapId()) {
		case 240080600:
		case 920010000:
		case 930000000:
		case 930000100:
		case 910010000:
		case 922010100:
		case 910340100:
		case 925100000:
		case 926100000:
		case 926110000:
		case 921120005:
		case 932000100:
		case 923040100:
		case 921160100:
			c.getSession().write(CField.achievementRatio(0));
			break;
		case 930000200:
		case 922010200:
		case 922010300:
		case 922010400:
		case 922010401:
		case 922010402:
		case 922010403:
		case 922010404:
		case 922010405:
		case 925100100:
		case 926100001:
		case 926110001:
		case 921160200:
			c.getSession().write(CField.achievementRatio(10));
			break;
		case 930000300:
		case 910340200:
		case 922010500:
		case 922010600:
		case 925100200:
		case 925100201:
		case 925100202:
		case 926100100:
		case 926110100:
		case 921120100:
		case 932000200:
		case 923040200:
		case 921160300:
		case 921160310:
		case 921160320:
		case 921160330:
		case 921160340:
		case 921160350:
			c.getSession().write(CField.achievementRatio(25));
			break;
		case 930000400:
		case 926100200:
		case 926110200:
		case 926100201:
		case 926110201:
		case 926100202:
		case 926110202:
		case 921160400:
			c.getSession().write(CField.achievementRatio(35));
			break;
		case 910340300:
		case 922010700:
		case 930000500:
		case 925100300:
		case 925100301:
		case 925100302:
		case 926100203:
		case 926110203:
		case 921120200:
		case 932000300:
		case 240080700:
		case 240080800:
		case 923040300:
		case 921160500:
			c.getSession().write(CField.achievementRatio(50));
			break;
		case 910340400:
		case 922010800:
		case 930000600:
		case 925100400:
		case 926100300:
		case 926110300:
		case 926100301:
		case 926110301:
		case 926100302:
		case 926110302:
		case 926100303:
		case 926110303:
		case 926100304:
		case 926110304:
		case 921120300:
		case 932000400:
		case 923040400:
		case 921160600:
			c.getSession().write(CField.achievementRatio(70));
			break;
		case 910340500:
		case 922010900:
		case 930000700:
		case 920010800:
		case 925100500:
		case 926100400:
		case 926110400:
		case 926100401:
		case 926110401:
		case 921120400:
		case 921160700:
			c.getSession().write(CField.achievementRatio(85));
			break;
		case 922011000:
		case 922011100:
		case 930000800:
		case 920011000:
		case 920011100:
		case 920011200:
		case 920011300:
		case 925100600:
		case 926100500:
		case 926110500:
		case 926100600:
		case 926110600:
		case 921120500:
		case 921120600:
			c.getSession().write(CField.achievementRatio(100));
			break;
		}
	}

	public static final boolean isRedLeaf(int mapid) {
		return mapid / 1000000 == 744;
	}
}
