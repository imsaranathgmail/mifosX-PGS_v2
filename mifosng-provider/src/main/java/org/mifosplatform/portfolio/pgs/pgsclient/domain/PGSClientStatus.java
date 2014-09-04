/**
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mifosplatform.portfolio.pgs.pgsclient.domain;

/**
 * Enum representation of client status states.
 */
public enum PGSClientStatus {

    INVALID(0, "clientStatusType.invalid"), //
    PENDING(100, "clientStatusType.pending"), //
    ACTIVE(300, "clientStatusType.active"), //
    TRANSFER_IN_PROGRESS(303, "clientStatusType.transfer.in.progress"), //
    TRANSFER_ON_HOLD(304, "clientStatusType.transfer.on.hold"), //
    CLOSED(600, "clientStatusType.closed");

    private final Integer value;
    private final String code;

    public static PGSClientStatus fromInt(final Integer statusValue) {

        PGSClientStatus enumeration = PGSClientStatus.INVALID;
        switch (statusValue) {
            case 100:
                enumeration = PGSClientStatus.PENDING;
            break;
            case 300:
                enumeration = PGSClientStatus.ACTIVE;
            break;
            case 303:
                enumeration = PGSClientStatus.TRANSFER_IN_PROGRESS;
            break;
            case 304:
                enumeration = PGSClientStatus.TRANSFER_ON_HOLD;
            break;
            case 600:
                enumeration = PGSClientStatus.CLOSED;
            break;
        }
        return enumeration;
    }

    private PGSClientStatus(final Integer value, final String code) {
        this.value = value;
        this.code = code;
    }

    public boolean hasStateOf(final PGSClientStatus state) {
        return this.value.equals(state.getValue());
    }

    public Integer getValue() {
        return this.value;
    }

    public String getCode() {
        return this.code;
    }

    public boolean isPending() {
        return this.value.equals(PGSClientStatus.PENDING.getValue());
    }

    public boolean isActive() {
        return this.value.equals(PGSClientStatus.ACTIVE.getValue());
    }

    public boolean isClosed() {
        return this.value.equals(PGSClientStatus.CLOSED.getValue());
    }

    public boolean isTransferInProgress() {
        return this.value.equals(PGSClientStatus.TRANSFER_IN_PROGRESS.getValue());
    }

    public boolean isTransferOnHold() {
        return this.value.equals(PGSClientStatus.TRANSFER_ON_HOLD.getValue());
    }

    public boolean isUnderTransfer() {
        return isTransferInProgress() || isTransferOnHold();
    }
}