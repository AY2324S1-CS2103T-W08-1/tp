---
  layout: default.md
  title: "User Guide"
  pageNav: 3
---

# Staff-Snap User Guide

## User Interface Guide

![User Interface Guide Example](images/user-guide/userInterfaceGuide.png)


## Introduction
Staffsnap is an application meant HR managers hiring canadidates to make applicant tracking easier.

## Features

<box type="tip" seamless>

**Notation Guide**<br>

* Words in `UPPER_CASE` are the parameters to be supplied by the user.
* Items in square brackets are optional. 
* Parameters can be in any order. 
* Extraneous parameters for commands that do not take in parameters such as `help`, `list`, `clear`, `exit` will be ignored.

</box>

---
### `help` : Viewing help

Opens up the user guide in the browser. Also displays a list of basic commands the user can use.

Format: `help`

UI mockup:
![Help UI Mockup](images/user-guide/help.png)

---
### `add` : Adding a new applicant

Adds a new applicant to the current list.

Format: `add n/NAME hp/PHONE e/EMAIL p/POSITION`

Example:
* `add n/John Doe hp/91234567 e/johndoe@gmail.com p/Software Engineer`
* `add n/Jane Greenwood p/Project Manager e/janeg@yahoo.com hp/91234567`

UI mockup:
![Add UI Mockup](images/user-guide/add.png)

---
### `edit` : Editing an applicant

Edits the details of an applicant in the list.

Format: `edit INDEX [n/NAME] [hp/PHONE] [e/EMAIL] [p/POSITION]`
* Edits the person at the specified `INDEX`. The index refers to the index number shown in the displayed person list.
* At least one of the optional fields must be provided.
* Existing values will be updated by the input values.

Example:
* `edit 1 n/Vijay Sankar Kumar` edits the name of the 1st applicant in the list.
* `edit 2 hp/80081234 e/newEmail@hotmail.com` edits the phone number and email of the 2nd applicant in the list.

UI mockup:
![Edit UI Mockup](images/user-guide/edit.png)

---
### `list` : Listing all applicants

Displays the full list of all applicants.

Format: `list`

UI mockup:
![List UI Mockup](images/user-guide/list.png)

---
### `delete` : Deleting an applicant

Deletes a particular applicant based on their index number.

Format: `delete INDEX`
* Deletes the person at the specified `INDEX`.
* The index refers to the index number shown in the displayed applicant list.
* The index **must be a positive integer** 1, 2, 3, ….

Examples:
* `list` followed by `delete 2` deletes the 2nd person in the applicant list.
* `sort d/name` followed by `delete 3` deletes the 3rd person in the sorted applicant list.

UI mockup:
![Delete UI Mockup](images/user-guide/delete.png)

---
### `find` : Finding an applicant by name

Find employees whose name contains a particular keyword.

Format: `find KEYWORD [MORE_KEYWORDS]`
* The search is case-insensitive, e.g. `JOHN` will return both `john` and `John`.
* The order of the keywords does not matter. e.g. `Alice Tan` will match `Tan Alice`.
* Only the applicant name is searched.
* Any person whose name contains the sequence of characters given as the keyword will be given as a result. e.g. `Ed` will match both `Edward` and `Ed`.
* Persons matching at least one keyword will be returned (i.e. OR search). e.g. `Ben Bobby` will return `Ben Yang`, `Bobby Chin`.

Examples:
* `find IVAN` finds any applicant whose name contains “ivan”.
* `find IVAN CHEW` finds any applicant whose name contains “ivan” or contains “chew”.

UI mockup:
![Find UI Mockup](images/user-guide/find.png)

---
### `sort`: Sorting applicants by descriptor

Sorts the applicant list by using a particular descriptor as the sorting criteria.

Format: `sort d/DESCRIPTOR`
* `DESCRIPTOR` must be either `name` or `phone` or `email` or `position` or `score` or `status`.

Examples:
* `sort d/name` sorts the applicant list by name in alphabetical order.
* `sort d/phone` sorts the applicant list by phone numbers in ascending order.
* `sort d/email` sorts the applicant list by email in alphabetical order.
* `sort d/position` sorts the applicant list by positions in alphabetical order.
* `sort d/score` sorts the applicant list by score in descending order.
* `sort d/status` sorts the applicant list by status in alphabetical order.

UI mockup:
![Sort UI Mockup](images/user-guide/sort.png)

---
### `addi` : Adding an interview to an applicant

Adds a new interview to an applicant. In the case of duplicate names, the system will automatically increment the last 
number in the user input by 1, or add 1 if there is no number.

Duplicate handling: 
* Entering `technical12`, then `technical12` again will result in the 2nd entry being converted to 
`technical13`.
* Entering `technical`, then `technical` again will result in the 2nd entry being converted to `technical1`.

Format: `addi INDEX t/TYPE [r/RATING]`

Examples:
* `addi 1 t/technical r/8.6` adds a Technical interview with rating 8.6 to the 1st person in the displayed applicant list.
* `addi 3 t/screening` adds a Screening interview without rating to the 3rd person in the displayed applicant list.

---
### `editi` : Editing an interview of an applicant

Edits an interview of an applicant.

Format: `editi INDEX i/INTERVIEW_INDEX [t/TYPE] [r/RATING]`
* Edits the person at the specified `INDEX`. The index refers to the index number shown in the displayed person list.
* At least one of the optional fields must be provided.
* Existing values will be updated by the input values.

Examples:
* `editi 1 i/1 t/technical r/7.8` edits the 1st interview of the 1st person in the displayed applicant list to a technical interview with rating 7.8.
* `editi 3 i/2 t/screening` edits the 2nd interview type of the 3rd person in the displayed applicant list to a screening interview.
* `editi 2 i/1 r/8.9` edits the 1st interview rating of the 2nd person in the displayed applicant list to 8.9.

---
### `deletei` : Deleting an interview from an applicant

Deletes an interview from an applicant.

Format: `deletei INDEX i/INTERVIEW_INDEX`

Examples:
* `deletei 1 i/2` deletes the 2nd interview of the 1st person in the displayed applicant list.

---
### `status` : Editing an applicant status

Edits the status of an applicant.

Format: `status INDEX s/STATUS`
* Edits the person at the specified `INDEX`. The index refers to the index number shown in the displayed person list.
* `STATUS` must be either `o`(offered) or `r`(rejected) or `u`(undecided).

Examples:
* `status 3 s/o` updates the status of the 3rd person in the displayed applicant list to OFFERED.

---
### `clear` : Clearing all applicant entries

After typing `clear`, system asks the user to confirm clearing. If user types `yes`, all the current data stored 
in the system is the cleared. Else, the clear process is cancelled. 

Format: `clear`

UI mockup:
![Clear UI Mockup](images/user-guide/clear.png)

---
### `exit` : Exiting the program

Exits the program.

Format: `exit`

---
### Saving the data

Automatically saves the data to a local storage whenever there is a change to the applicant list. There is no need to save manually.

---
### Editing the data file

<box type="warning" header="**Caution**">
    If the format of the edited data file is invalid, Staff-Snap will override the existing data file with an empty data file in the next run. Please make a backup before you attempt to edit the data file!
</box>

Staff-Snap applicant data are saved automatically as a JSON file `[JAR file location]/data/applicantBook.json`. Advanced users are welcome to update data directly by editing that data file.

