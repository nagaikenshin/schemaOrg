package org.kyojo.schemaOrg.m3n3.doma.core.contactPointOption;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.contactPointOption.HEARING_IMPAIRED_SUPPORTED;
import org.kyojo.schemaOrg.m3n3.core.ContactPointOption.HearingImpairedSupported;

@ExternalDomain
public class HearingImpairedSupportedConverter implements DomainConverter<HearingImpairedSupported, String> {

	@Override
	public String fromDomainToValue(HearingImpairedSupported domain) {
		return domain.getNativeValue();
	}

	@Override
	public HearingImpairedSupported fromValueToDomain(String value) {
		return new HEARING_IMPAIRED_SUPPORTED(value);
	}

}
