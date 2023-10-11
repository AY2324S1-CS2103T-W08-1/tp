package seedu.staffsnap.logic.parser;

<<<<<<< HEAD:src/test/java/seedu/staffsnap/logic/parser/EditCommandParserTest.java
import static seedu.staffsnap.logic.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.staffsnap.logic.commands.CommandTestUtil.EMAIL_DESC_AMY;
import static seedu.staffsnap.logic.commands.CommandTestUtil.EMAIL_DESC_BOB;
import static seedu.staffsnap.logic.commands.CommandTestUtil.INVALID_EMAIL_DESC;
import static seedu.staffsnap.logic.commands.CommandTestUtil.INVALID_JOB_TITLE_DESC;
import static seedu.staffsnap.logic.commands.CommandTestUtil.INVALID_NAME_DESC;
import static seedu.staffsnap.logic.commands.CommandTestUtil.INVALID_PHONE_DESC;
import static seedu.staffsnap.logic.commands.CommandTestUtil.INVALID_TAG_DESC;
import static seedu.staffsnap.logic.commands.CommandTestUtil.JOB_TITLE_DESC_AMY;
import static seedu.staffsnap.logic.commands.CommandTestUtil.JOB_TITLE_DESC_BOB;
import static seedu.staffsnap.logic.commands.CommandTestUtil.NAME_DESC_AMY;
import static seedu.staffsnap.logic.commands.CommandTestUtil.PHONE_DESC_AMY;
import static seedu.staffsnap.logic.commands.CommandTestUtil.PHONE_DESC_BOB;
import static seedu.staffsnap.logic.commands.CommandTestUtil.TAG_DESC_FRIEND;
import static seedu.staffsnap.logic.commands.CommandTestUtil.TAG_DESC_HUSBAND;
import static seedu.staffsnap.logic.commands.CommandTestUtil.VALID_EMAIL_AMY;
import static seedu.staffsnap.logic.commands.CommandTestUtil.VALID_JOB_TITLE_AMY;
import static seedu.staffsnap.logic.commands.CommandTestUtil.VALID_NAME_AMY;
import static seedu.staffsnap.logic.commands.CommandTestUtil.VALID_PHONE_AMY;
import static seedu.staffsnap.logic.commands.CommandTestUtil.VALID_PHONE_BOB;
import static seedu.staffsnap.logic.commands.CommandTestUtil.VALID_TAG_FRIEND;
import static seedu.staffsnap.logic.commands.CommandTestUtil.VALID_TAG_HUSBAND;
import static seedu.staffsnap.logic.parser.CliSyntax.PREFIX_EMAIL;
import static seedu.staffsnap.logic.parser.CliSyntax.PREFIX_JOB_TITLE;
import static seedu.staffsnap.logic.parser.CliSyntax.PREFIX_PHONE;
import static seedu.staffsnap.logic.parser.CliSyntax.PREFIX_TAG;
import static seedu.staffsnap.logic.parser.CommandParserTestUtil.assertParseFailure;
import static seedu.staffsnap.logic.parser.CommandParserTestUtil.assertParseSuccess;
import static seedu.staffsnap.testutil.TypicalIndexes.INDEX_FIRST_EMPLOYEE;
import static seedu.staffsnap.testutil.TypicalIndexes.INDEX_SECOND_EMPLOYEE;
import static seedu.staffsnap.testutil.TypicalIndexes.INDEX_THIRD_EMPLOYEE;

import org.junit.jupiter.api.Test;

import seedu.staffsnap.commons.core.index.Index;
import seedu.staffsnap.logic.Messages;
import seedu.staffsnap.logic.commands.EditCommand;
import seedu.staffsnap.logic.commands.EditCommand.EditEmployeeDescriptor;
import seedu.staffsnap.model.employee.Email;
import seedu.staffsnap.model.employee.JobTitle;
import seedu.staffsnap.model.employee.Name;
import seedu.staffsnap.model.employee.Phone;
import seedu.staffsnap.model.tag.Tag;
import seedu.staffsnap.testutil.EditEmployeeDescriptorBuilder;
=======
import static seedu.address.logic.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.address.logic.commands.CommandTestUtil.ADDRESS_DESC_AMY;
import static seedu.address.logic.commands.CommandTestUtil.ADDRESS_DESC_BOB;
import static seedu.address.logic.commands.CommandTestUtil.DEPARTMENT_DESC_AMY;
import static seedu.address.logic.commands.CommandTestUtil.DEPARTMENT_DESC_BOB;
import static seedu.address.logic.commands.CommandTestUtil.INVALID_ADDRESS_DESC;
import static seedu.address.logic.commands.CommandTestUtil.INVALID_DEPARTMENT_DESC;
import static seedu.address.logic.commands.CommandTestUtil.INVALID_NAME_DESC;
import static seedu.address.logic.commands.CommandTestUtil.INVALID_PHONE_DESC;
import static seedu.address.logic.commands.CommandTestUtil.INVALID_TAG_DESC;
import static seedu.address.logic.commands.CommandTestUtil.NAME_DESC_AMY;
import static seedu.address.logic.commands.CommandTestUtil.PHONE_DESC_AMY;
import static seedu.address.logic.commands.CommandTestUtil.PHONE_DESC_BOB;
import static seedu.address.logic.commands.CommandTestUtil.TAG_DESC_FRIEND;
import static seedu.address.logic.commands.CommandTestUtil.TAG_DESC_HUSBAND;
import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_DEPARTMENT_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_FRIEND;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_HUSBAND;
import static seedu.address.logic.parser.CliSyntax.PREFIX_ADDRESS;
import static seedu.address.logic.parser.CliSyntax.PREFIX_DEPARTMENT;
import static seedu.address.logic.parser.CliSyntax.PREFIX_PHONE;
import static seedu.address.logic.parser.CliSyntax.PREFIX_TAG;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseFailure;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseSuccess;
import static seedu.address.testutil.TypicalIndexes.INDEX_FIRST_EMPLOYEE;
import static seedu.address.testutil.TypicalIndexes.INDEX_SECOND_EMPLOYEE;
import static seedu.address.testutil.TypicalIndexes.INDEX_THIRD_EMPLOYEE;

import org.junit.jupiter.api.Test;

import seedu.address.commons.core.index.Index;
import seedu.address.logic.Messages;
import seedu.address.logic.commands.EditCommand;
import seedu.address.logic.commands.EditCommand.EditEmployeeDescriptor;
import seedu.address.model.employee.Address;
import seedu.address.model.employee.Department;
import seedu.address.model.employee.Name;
import seedu.address.model.employee.Phone;
import seedu.address.model.tag.Tag;
import seedu.address.testutil.EditEmployeeDescriptorBuilder;
>>>>>>> 81681bbbe6672d8647326ca44cf820b987267d7b:src/test/java/seedu/address/logic/parser/EditCommandParserTest.java

public class EditCommandParserTest {

    private static final String TAG_EMPTY = " " + PREFIX_TAG;

    private static final String MESSAGE_INVALID_FORMAT =
            String.format(MESSAGE_INVALID_COMMAND_FORMAT, EditCommand.MESSAGE_USAGE);

    private EditCommandParser parser = new EditCommandParser();

    @Test
    public void parse_missingParts_failure() {
        // no index specified
        assertParseFailure(parser, VALID_NAME_AMY, MESSAGE_INVALID_FORMAT);

        // no field specified
        assertParseFailure(parser, "1", EditCommand.MESSAGE_NOT_EDITED);

        // no index and no field specified
        assertParseFailure(parser, "", MESSAGE_INVALID_FORMAT);
    }

    @Test
    public void parse_invalidPreamble_failure() {
        // negative index
        assertParseFailure(parser, "-5" + NAME_DESC_AMY, MESSAGE_INVALID_FORMAT);

        // zero index
        assertParseFailure(parser, "0" + NAME_DESC_AMY, MESSAGE_INVALID_FORMAT);

        // invalid arguments being parsed as preamble
        assertParseFailure(parser, "1 some random string", MESSAGE_INVALID_FORMAT);

        // invalid prefix being parsed as preamble
        assertParseFailure(parser, "1 i/ string", MESSAGE_INVALID_FORMAT);
    }

    @Test
    public void parse_invalidValue_failure() {
        assertParseFailure(parser, "1" + INVALID_NAME_DESC, Name.MESSAGE_CONSTRAINTS); // invalid name
        assertParseFailure(parser, "1" + INVALID_PHONE_DESC, Phone.MESSAGE_CONSTRAINTS); // invalid phone
<<<<<<< HEAD:src/test/java/seedu/staffsnap/logic/parser/EditCommandParserTest.java
        assertParseFailure(parser, "1" + INVALID_EMAIL_DESC, Email.MESSAGE_CONSTRAINTS); // invalid email
        assertParseFailure(parser, "1" + INVALID_JOB_TITLE_DESC, JobTitle.MESSAGE_CONSTRAINTS); // invalid jobTitle
=======
        assertParseFailure(parser, "1" + INVALID_DEPARTMENT_DESC, Department.MESSAGE_CONSTRAINTS); // invalid department
        assertParseFailure(parser, "1" + INVALID_ADDRESS_DESC, Address.MESSAGE_CONSTRAINTS); // invalid address
>>>>>>> 81681bbbe6672d8647326ca44cf820b987267d7b:src/test/java/seedu/address/logic/parser/EditCommandParserTest.java
        assertParseFailure(parser, "1" + INVALID_TAG_DESC, Tag.MESSAGE_CONSTRAINTS); // invalid tag

        // invalid phone followed by valid department
        assertParseFailure(parser, "1" + INVALID_PHONE_DESC + DEPARTMENT_DESC_AMY, Phone.MESSAGE_CONSTRAINTS);

        // while parsing {@code PREFIX_TAG} alone will reset the tags of the {@code Employee} being edited,
        // parsing it together with a valid tag results in error
        assertParseFailure(parser, "1" + TAG_DESC_FRIEND + TAG_DESC_HUSBAND + TAG_EMPTY, Tag.MESSAGE_CONSTRAINTS);
        assertParseFailure(parser, "1" + TAG_DESC_FRIEND + TAG_EMPTY + TAG_DESC_HUSBAND, Tag.MESSAGE_CONSTRAINTS);
        assertParseFailure(parser, "1" + TAG_EMPTY + TAG_DESC_FRIEND + TAG_DESC_HUSBAND, Tag.MESSAGE_CONSTRAINTS);

        // multiple invalid values, but only the first invalid value is captured
<<<<<<< HEAD:src/test/java/seedu/staffsnap/logic/parser/EditCommandParserTest.java
        assertParseFailure(parser, "1" + INVALID_NAME_DESC + INVALID_EMAIL_DESC + VALID_JOB_TITLE_AMY + VALID_PHONE_AMY,
                Name.MESSAGE_CONSTRAINTS);
=======
        assertParseFailure(parser, "1" + INVALID_NAME_DESC + INVALID_DEPARTMENT_DESC + VALID_ADDRESS_AMY
                        + VALID_PHONE_AMY, Name.MESSAGE_CONSTRAINTS);
>>>>>>> 81681bbbe6672d8647326ca44cf820b987267d7b:src/test/java/seedu/address/logic/parser/EditCommandParserTest.java
    }

    @Test
    public void parse_allFieldsSpecified_success() {
        Index targetIndex = INDEX_SECOND_EMPLOYEE;
        String userInput = targetIndex.getOneBased() + PHONE_DESC_BOB + TAG_DESC_HUSBAND
<<<<<<< HEAD:src/test/java/seedu/staffsnap/logic/parser/EditCommandParserTest.java
                + EMAIL_DESC_AMY + JOB_TITLE_DESC_AMY + NAME_DESC_AMY + TAG_DESC_FRIEND;

        EditEmployeeDescriptor descriptor = new EditEmployeeDescriptorBuilder().withName(VALID_NAME_AMY)
                .withPhone(VALID_PHONE_BOB).withEmail(VALID_EMAIL_AMY).withJobTitle(VALID_JOB_TITLE_AMY)
=======
                + DEPARTMENT_DESC_AMY + ADDRESS_DESC_AMY + NAME_DESC_AMY + TAG_DESC_FRIEND;

        EditEmployeeDescriptor descriptor = new EditEmployeeDescriptorBuilder().withName(VALID_NAME_AMY)
                .withPhone(VALID_PHONE_BOB).withDepartment(VALID_DEPARTMENT_AMY).withAddress(VALID_ADDRESS_AMY)
>>>>>>> 81681bbbe6672d8647326ca44cf820b987267d7b:src/test/java/seedu/address/logic/parser/EditCommandParserTest.java
                .withTags(VALID_TAG_HUSBAND, VALID_TAG_FRIEND).build();
        EditCommand expectedCommand = new EditCommand(targetIndex, descriptor);

        assertParseSuccess(parser, userInput, expectedCommand);
    }

    @Test
    public void parse_someFieldsSpecified_success() {
        Index targetIndex = INDEX_FIRST_EMPLOYEE;
        String userInput = targetIndex.getOneBased() + PHONE_DESC_BOB + DEPARTMENT_DESC_AMY;

        EditEmployeeDescriptor descriptor = new EditEmployeeDescriptorBuilder().withPhone(VALID_PHONE_BOB)
                .withDepartment(VALID_DEPARTMENT_AMY).build();
        EditCommand expectedCommand = new EditCommand(targetIndex, descriptor);

        assertParseSuccess(parser, userInput, expectedCommand);
    }

    @Test
    public void parse_oneFieldSpecified_success() {
        // name
        Index targetIndex = INDEX_THIRD_EMPLOYEE;
        String userInput = targetIndex.getOneBased() + NAME_DESC_AMY;
        EditEmployeeDescriptor descriptor = new EditEmployeeDescriptorBuilder().withName(VALID_NAME_AMY).build();
        EditCommand expectedCommand = new EditCommand(targetIndex, descriptor);
        assertParseSuccess(parser, userInput, expectedCommand);

        // phone
        userInput = targetIndex.getOneBased() + PHONE_DESC_AMY;
        descriptor = new EditEmployeeDescriptorBuilder().withPhone(VALID_PHONE_AMY).build();
        expectedCommand = new EditCommand(targetIndex, descriptor);
        assertParseSuccess(parser, userInput, expectedCommand);

        // department
        userInput = targetIndex.getOneBased() + DEPARTMENT_DESC_AMY;
        descriptor = new EditEmployeeDescriptorBuilder().withDepartment(VALID_DEPARTMENT_AMY).build();
        expectedCommand = new EditCommand(targetIndex, descriptor);
        assertParseSuccess(parser, userInput, expectedCommand);

        // jobTitle
        userInput = targetIndex.getOneBased() + JOB_TITLE_DESC_AMY;
        descriptor = new EditEmployeeDescriptorBuilder().withJobTitle(VALID_JOB_TITLE_AMY).build();
        expectedCommand = new EditCommand(targetIndex, descriptor);
        assertParseSuccess(parser, userInput, expectedCommand);

        // tags
        userInput = targetIndex.getOneBased() + TAG_DESC_FRIEND;
        descriptor = new EditEmployeeDescriptorBuilder().withTags(VALID_TAG_FRIEND).build();
        expectedCommand = new EditCommand(targetIndex, descriptor);
        assertParseSuccess(parser, userInput, expectedCommand);
    }

    @Test
    public void parse_multipleRepeatedFields_failure() {
        // More extensive testing of duplicate parameter detections is done in
        // AddCommandParserTest#parse_repeatedNonTagValue_failure()

        // valid followed by invalid
        Index targetIndex = INDEX_FIRST_EMPLOYEE;
        String userInput = targetIndex.getOneBased() + INVALID_PHONE_DESC + PHONE_DESC_BOB;

        assertParseFailure(parser, userInput, Messages.getErrorMessageForDuplicatePrefixes(PREFIX_PHONE));

        // invalid followed by valid
        userInput = targetIndex.getOneBased() + PHONE_DESC_BOB + INVALID_PHONE_DESC;

        assertParseFailure(parser, userInput, Messages.getErrorMessageForDuplicatePrefixes(PREFIX_PHONE));

        // mulltiple valid fields repeated
<<<<<<< HEAD:src/test/java/seedu/staffsnap/logic/parser/EditCommandParserTest.java
        userInput = targetIndex.getOneBased() + PHONE_DESC_AMY + JOB_TITLE_DESC_AMY + EMAIL_DESC_AMY
                + TAG_DESC_FRIEND + PHONE_DESC_AMY + JOB_TITLE_DESC_AMY + EMAIL_DESC_AMY + TAG_DESC_FRIEND
                + PHONE_DESC_BOB + JOB_TITLE_DESC_BOB + EMAIL_DESC_BOB + TAG_DESC_HUSBAND;

        assertParseFailure(parser, userInput,
                Messages.getErrorMessageForDuplicatePrefixes(PREFIX_PHONE, PREFIX_EMAIL, PREFIX_JOB_TITLE));

        // multiple invalid values
        userInput = targetIndex.getOneBased() + INVALID_PHONE_DESC + INVALID_JOB_TITLE_DESC + INVALID_EMAIL_DESC
                + INVALID_PHONE_DESC + INVALID_JOB_TITLE_DESC + INVALID_EMAIL_DESC;

        assertParseFailure(parser, userInput,
                Messages.getErrorMessageForDuplicatePrefixes(PREFIX_PHONE, PREFIX_EMAIL, PREFIX_JOB_TITLE));
=======
        userInput = targetIndex.getOneBased() + PHONE_DESC_AMY + ADDRESS_DESC_AMY + DEPARTMENT_DESC_AMY
                + TAG_DESC_FRIEND + PHONE_DESC_AMY + ADDRESS_DESC_AMY + DEPARTMENT_DESC_AMY + TAG_DESC_FRIEND
                + PHONE_DESC_BOB + ADDRESS_DESC_BOB + DEPARTMENT_DESC_BOB + TAG_DESC_HUSBAND;

        assertParseFailure(parser, userInput,
                Messages.getErrorMessageForDuplicatePrefixes(PREFIX_PHONE, PREFIX_DEPARTMENT, PREFIX_ADDRESS));

        // multiple invalid values
        userInput = targetIndex.getOneBased() + INVALID_PHONE_DESC + INVALID_ADDRESS_DESC + INVALID_DEPARTMENT_DESC
                + INVALID_PHONE_DESC + INVALID_ADDRESS_DESC + INVALID_DEPARTMENT_DESC;

        assertParseFailure(parser, userInput,
                Messages.getErrorMessageForDuplicatePrefixes(PREFIX_PHONE, PREFIX_DEPARTMENT, PREFIX_ADDRESS));
>>>>>>> 81681bbbe6672d8647326ca44cf820b987267d7b:src/test/java/seedu/address/logic/parser/EditCommandParserTest.java
    }

    @Test
    public void parse_resetTags_success() {
        Index targetIndex = INDEX_THIRD_EMPLOYEE;
        String userInput = targetIndex.getOneBased() + TAG_EMPTY;

        EditEmployeeDescriptor descriptor = new EditEmployeeDescriptorBuilder().withTags().build();
        EditCommand expectedCommand = new EditCommand(targetIndex, descriptor);

        assertParseSuccess(parser, userInput, expectedCommand);
    }
}