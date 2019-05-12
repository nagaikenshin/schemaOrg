package org.kyojo.schemaorg.m3n5.doma.core.contactPointOption;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.contactPointOption.HEARING_IMPAIRED_SUPPORTED;
import org.kyojo.schemaorg.m3n5.core.ContactPointOption.HearingImpairedSupported;

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
