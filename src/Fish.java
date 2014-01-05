import org.powerbot.script.methods.MethodContext;


public class Fish extends Task {

	public Fish(MethodContext ctx) {
		super(ctx);
		
	}

	@Override
	public boolean activate() {
		
		return ctx.backpack.select().count() < 28
				&& 
	}

	@Override
	public void execute() {
		
		
	}

}
