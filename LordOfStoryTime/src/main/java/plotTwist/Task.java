package plotTwist;

public class Task {
	String taskName;
	String Objective;

	
	
	public Task(String taskName) {
		this.taskName = taskName;
		this.Objective = "";
	}
	
	public Task(String taskName, String objective) {
		super();
		this.taskName = taskName;
		Objective = objective;
	}
	
	public String getObjective() {
		return Objective;
	}
	
	public boolean addObjective(String objective) {
		if (this.Objective.equals(new String(""))) {
			this.Objective = objective;
			return true;
		} else {
			return false;
		}
	}
	
	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	
}
