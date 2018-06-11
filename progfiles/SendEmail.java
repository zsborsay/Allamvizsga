private void buildAndSendMail(String email, String writer) 
		throws MessagingException {
	MimeMessage message = sender.createMimeMessage();
	MimeMessageHelper helper = new MimeMessageHelper(message, true);
	helper.setTo(new InternetAddress(email));
	helper.setSubject("emigrated App invitation");
	helper.setText(writer, true);
	sender.send(message);
}