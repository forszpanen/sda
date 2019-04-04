package com.sda.templatemethod;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TemplateMethodTest {

    @Test
    public void shouldCreateMD5Hash() {
        final Encoder encoder = new MD5Encoder();

        final String hash = encoder.encode("TEST STRING");

        assertEquals("LX1odDJ1io7uynt+XVGOfw==", hash);
    }

    @Test
    public void shouldCreateSHA1Hash() {
        final Encoder encoder = new SHA1Encoder();

        final String hash = encoder.encode("TEST STRING");

        assertEquals("050AnAV5epOnlyCVLpnHBUok58Q=", hash);
    }
}
