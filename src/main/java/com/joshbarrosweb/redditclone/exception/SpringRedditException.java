package com.joshbarrosweb.redditclone.exception;

import org.springframework.mail.MailException;

public class SpringRedditException extends Throwable {
    public SpringRedditException(String exceptionMessage, MailException e) {
        super(exceptionMessage);
    }
}
