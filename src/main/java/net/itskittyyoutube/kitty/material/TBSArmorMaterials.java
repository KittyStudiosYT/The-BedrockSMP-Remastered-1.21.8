package net.itskittyyoutube.kitty.material;

import net.itskittyyoutube.kitty.TBS;
import net.itskittyyoutube.kitty.sounds.TBSSoundEvents;
import net.itskittyyoutube.kitty.util.TBSTags;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;

public class TBSArmorMaterials {
    static RegistryKey<? extends Registry<EquipmentAsset>> REGISTRY_KEY = RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset"));
    public static final RegistryKey<EquipmentAsset> DIAMARITE_KEY = RegistryKey.of(REGISTRY_KEY, Identifier.of(TBS.MOD_ID, "diamarite"));
    public static final RegistryKey<EquipmentAsset> CORRUPTIONITE_KEY = RegistryKey.of(REGISTRY_KEY, Identifier.of(TBS.MOD_ID, "corruptionite"));
    public static final RegistryKey<EquipmentAsset> BYZANTIUM_KEY = RegistryKey.of(REGISTRY_KEY, Identifier.of(TBS.MOD_ID, "byzantium"));

    public static final ArmorMaterial DIAMARITE = new ArmorMaterial(37, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 3);
        map.put(EquipmentType.LEGGINGS, 6);
        map.put(EquipmentType.CHESTPLATE, 8);
        map.put(EquipmentType.HELMET, 3);
        map.put(EquipmentType.BODY, 11);
    }), 15, TBSSoundEvents.ITEM_ARMOR_EQUIP_DIAMARITE,3.0F,0.1F, TBSTags.Items.NETHERITE_EQUIPMENT_REPAIR, DIAMARITE_KEY);

    public static final ArmorMaterial CORRUPTIONITE = new ArmorMaterial(37, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 3);
        map.put(EquipmentType.LEGGINGS, 6);
        map.put(EquipmentType.CHESTPLATE, 8);
        map.put(EquipmentType.HELMET, 3);
        map.put(EquipmentType.BODY, 11);
    }), 15, TBSSoundEvents.ITEM_ARMOR_EQUIP_CORRUPTIONITE,3.0F,0.1F, TBSTags.Items.NETHERITE_EQUIPMENT_REPAIR, CORRUPTIONITE_KEY);

    public static final ArmorMaterial BYZANTIUM = new ArmorMaterial(15, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 2);
        map.put(EquipmentType.LEGGINGS, 5);
        map.put(EquipmentType.CHESTPLATE, 6);
        map.put(EquipmentType.HELMET, 2);
        map.put(EquipmentType.BODY, 5);
    }), 9, TBSSoundEvents.ITEM_ARMOR_EQUIP_BYZANTIUM,0.0F,0.0F, TBSTags.Items.BYZANTIUM_EQUIPMENT_REPAIR, BYZANTIUM_KEY);
}
