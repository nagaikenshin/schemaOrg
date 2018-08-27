package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.SD_LICENSE;
import org.kyojo.schemaorg.m3n4.pending.Container.SdLicense;

@ExternalDomain
public class SdLicenseConverter implements DomainConverter<SdLicense, String> {

	@Override
	public String fromDomainToValue(SdLicense domain) {
		return domain.getNativeValue();
	}

	@Override
	public SdLicense fromValueToDomain(String value) {
		return new SD_LICENSE(value);
	}

}
