/*
 *       Copyright© (2019) WeBank Co., Ltd.
 *
 *       This file is part of weid-java-sdk.
 *
 *       weid-java-sdk is free software: you can redistribute it and/or modify
 *       it under the terms of the GNU Lesser General Public License as published by
 *       the Free Software Foundation, either version 3 of the License, or
 *       (at your option) any later version.
 *
 *       weid-java-sdk is distributed in the hope that it will be useful,
 *       but WITHOUT ANY WARRANTY; without even the implied warranty of
 *       MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *       GNU Lesser General Public License for more details.
 *
 *       You should have received a copy of the GNU Lesser General Public License
 *       along with weid-java-sdk.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.webank.weid.protocol.cpt;

import java.util.List;

import com.github.reinert.jjschema.Attributes;
import lombok.Data;

import com.webank.weid.protocol.base.CredentialPojo;

/**
 * Trusted timestamping envelope.
 *
 * @author junqizhang 2019.11
 */

@Data
@Attributes(title = "Trusted Timestamping", description = "Trusted timestamping envelope")
public class Cpt108 {

    /**
     * information about timestamp authority.
     */
    @Attributes(required = true, description = "Timestamp Authority")
    String timestampAuthority;

    /**
     * caculate the hash from the credentials.
     */
    @Attributes(required = true, description = "Claim Hash")
    String claimHash;

    /**
     * trusted timestamping provided by the trusted third party or by the consensus of each node in
     * the consortium chain.
     */
    @Attributes(required = true, description = "Timestamp")
    Long timestamp;

    /**
     * signed by Timestamp authority. authoritySignature = sign( hashKey )
     */
    @Attributes(required = true, description = "Signature value from Authority")
    String authoritySignature;

    /**
     * The credential list to be signed with timestamp.
     */
    @Attributes(required = true, description = "Original credential list to be signed")
    List<CredentialPojo> credentialList;
}
