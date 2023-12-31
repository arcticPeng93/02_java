package org.galapagos.common.cli.command;

import org.galapagos.common.cli.Input;
import org.galapagos.common.cli.ui.Application;

public class ExitCommand implements Command {
	private Application app;

	public ExitCommand(Application app) {
		super();
		this.app = app;
	}

	@Override
	public void execute() {
		boolean answer = Input.confirm("정말 종료할까요?");
		if (answer) {
			// 어플리케이션의 cleanup 실행
			app.cleanup();

			System.out.println("종료합니다.");
			System.exit(0);
		}
	}

}
