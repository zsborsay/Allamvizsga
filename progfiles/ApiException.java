public void requestInvitation(...) {
    ...
    try {
	if (requestInvitation.getCv().contains("pdf")) {
	    ...
	} else {
	    throw new ApiException(PDF_REQUIRED, HttpStatus.CONFLICT);
	}
    } catch (MailSendException | ServiceException e) {
	    throw new ApiException(SOMETHING_WRONG);
    }
}