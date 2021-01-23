/**
 * Abstract class for all various commands.
 */

public abstract class Command {

    /**
     * Executes the Command in DataHandler.
     *
     * @param tasks list of tasks where this new task is added to
     * @param input details of the task
     * @param dataHandler handles the various tasks according to their type
     */
    public abstract void execute(TaskList tasks, String input, DataHandler dataHandler);

    /**
     * Checks if it is time to exit Duke.
     */
    public abstract boolean isExit();
}
