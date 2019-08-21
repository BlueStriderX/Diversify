package net.thederpgamer.diversify.fauna;

import org.schema.common.util.linAlg.Vector3i;
import org.schema.game.common.controller.NetworkListenerEntity;
import org.schema.game.common.controller.ai.AIGameCreatureConfiguration;
import org.schema.game.common.data.creature.AICreature;
import org.schema.game.common.data.creature.AIPlayer;
import org.schema.game.common.data.creature.CreaturePartNode;
import org.schema.game.network.objects.TargetableAICreatureNetworkObject;
import org.schema.game.server.ai.AIControllerStateUnit;
import org.schema.game.server.ai.CreatureAIEntity;
import org.schema.schine.graphicsengine.core.Timer;
import org.schema.schine.network.StateInterface;
import com.bulletphysics.linearmath.Transform;

public abstract class AsteroidEater extends AICreature {

	public AsteroidEater(StateInterface var1) {
		super(var1);
	}

	public void handleControl(Timer var1, AIControllerStateUnit var2) {
		
	}

	protected AIPlayer instantiateOwnerState() {
		
		return null;
	}

	public boolean isMeleeAttacker() {
		return true;
	}

	public void initialFillInventory() {
		
	}

	public CreatureAIEntity instantiateAIEntity() {
		return null;
	}

	public CreaturePartNode getCreatureNode() {

		return null;
	}

	public void setSpeed(float var1) {
		
	}

	public void destroyPersistent() {
		
	}

	public Vector3i getBlockDim() {
		return null;
	}

	public float getCharacterHeight() {
		return 0;
	}

	public float getCharacterHeightOffset() {
		return 0;
	}

	protected float getCharacterMargin() {
		return 0;
	}

	public float getCharacterWidth() {
		return 0;
	}

	public Transform getShoulderWorldTransform() {
		return null;
	}

	public float getSpeed() {
		return 0;
	}

	public void addListener(NetworkListenerEntity var1) {
		
	}
}
