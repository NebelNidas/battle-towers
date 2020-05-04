package draylar.battletowers.world;

import draylar.battletowers.registry.BattleTowerStructures;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.structure.PoolStructurePiece;
import net.minecraft.structure.StructureManager;
import net.minecraft.structure.pool.StructurePoolElement;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockBox;
import net.minecraft.util.math.BlockPos;

public class BattleTowerPiece extends PoolStructurePiece {

    public BattleTowerPiece(StructureManager manager, StructurePoolElement poolElement, BlockPos pos, int groundLevelDelta, BlockRotation rotation, BlockBox boundingBox) {
        super(BattleTowerStructures.PIECE, manager, poolElement, pos, groundLevelDelta, rotation, boundingBox);
    }

    public BattleTowerPiece(StructureManager manager, CompoundTag tag) {
        super(manager, tag, BattleTowerStructures.PIECE);
    }
}
