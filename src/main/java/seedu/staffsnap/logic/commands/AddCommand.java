package seedu.staffsnap.logic.commands;

import static java.util.Objects.requireNonNull;
import static seedu.staffsnap.logic.parser.CliSyntax.PREFIX_DEPARTMENT;
import static seedu.staffsnap.logic.parser.CliSyntax.PREFIX_JOB_TITLE;
import static seedu.staffsnap.logic.parser.CliSyntax.PREFIX_NAME;
import static seedu.staffsnap.logic.parser.CliSyntax.PREFIX_PHONE;
import static seedu.staffsnap.logic.parser.CliSyntax.PREFIX_TAG;

import seedu.staffsnap.commons.util.ToStringBuilder;
import seedu.staffsnap.logic.Messages;
import seedu.staffsnap.logic.commands.exceptions.CommandException;
import seedu.staffsnap.model.Model;
import seedu.staffsnap.model.applicant.Applicant;

/**
 * Adds an applicant to the address book.
 */
public class AddCommand extends Command {

    public static final String COMMAND_WORD = "add";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Adds an applicant to the address book. "
            + "Parameters: "
            + PREFIX_NAME + "NAME "
            + PREFIX_PHONE + "PHONE "
            + PREFIX_DEPARTMENT + "DEPARTMENT "
            + PREFIX_JOB_TITLE + "JOBTITLE "
            + "[" + PREFIX_TAG + "TAG]...\n"
            + "Example: " + COMMAND_WORD + " "
            + PREFIX_NAME + "John Doe "
            + PREFIX_PHONE + "98765432 "
            + PREFIX_DEPARTMENT + "johnd@example.com "
            + PREFIX_JOB_TITLE + "311, Clementi Ave 2, #02-25 "
            + PREFIX_TAG + "friends "
            + PREFIX_TAG + "owesMoney";

    public static final String MESSAGE_SUCCESS = "New applicant added: %1$s";
    public static final String MESSAGE_DUPLICATE_APPLICANT = "This applicant already exists in the address book";

    private final Applicant toAdd;

    /**
     * Creates an AddCommand to add the specified {@code Applicant}
     */
    public AddCommand(Applicant applicant) {
        requireNonNull(applicant);
        toAdd = applicant;
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);

        if (model.hasApplicant(toAdd)) {
            throw new CommandException(MESSAGE_DUPLICATE_APPLICANT);
        }

        model.addApplicant(toAdd);
        return new CommandResult(String.format(MESSAGE_SUCCESS, Messages.format(toAdd)));
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof AddCommand)) {
            return false;
        }

        AddCommand otherAddCommand = (AddCommand) other;
        return toAdd.equals(otherAddCommand.toAdd);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .add("toAdd", toAdd)
                .toString();
    }
}
