/*
 * Copyright (c) 2013-2017 Turo
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.turo.pushy.apns;

/**
 * A do-nothing metrics listener.
 *
 * @author <a href="https://github.com/jchambers">Jon Chambers</a>
 */
class NoopMetricsListener implements ApnsClientMetricsListener {

    @Override
    public void handleWriteFailure(final ApnsClient apnsClient, final long notificationId) {
    }

    @Override
    public void handleNotificationSent(final ApnsClient apnsClient, final long notificationId) {
    }

    @Override
    public void handleNotificationAccepted(final ApnsClient apnsClient, final long notificationId) {
    }

    @Override
    public void handleNotificationRejected(final ApnsClient apnsClient, final long notificationId) {
    }

    @Override
    public void handleConnectionAttemptStarted(final ApnsClient apnsClient) {
    }

    @Override
    public void handleConnectionAttemptSucceeded(final ApnsClient apnsClient) {
    }

    @Override
    public void handleConnectionAttemptFailed(final ApnsClient apnsClient) {
    }
}