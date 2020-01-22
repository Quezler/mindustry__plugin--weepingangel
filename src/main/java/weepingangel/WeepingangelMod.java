package weepingangel;

import arc.*;
import mindustry.gen.Call;
import mindustry.plugin.Plugin;
import mindustry.game.EventType.*;

import static arc.util.Log.*;
import static mindustry.Vars.*;

public class WeepingangelMod extends Plugin{

    public WeepingangelMod(){
        Events.on(Trigger.class, () -> {

            if(state.rules.editor != playerGroup.isEmpty()){
                info(state.rules.editor ? "&lm[unpausing the server]" : "&lm[pausing the server]");
                Core.app.post(() -> Call.onSetRules(state.rules));
            }

            state.rules.editor = playerGroup.isEmpty();
        });
    }
}
