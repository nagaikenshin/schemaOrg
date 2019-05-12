package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.CORRECTION;
import org.kyojo.schemaorg.m3n5.pending.Container.Correction;

@ExternalDomain
public class CorrectionConverter implements DomainConverter<Correction, String> {

	@Override
	public String fromDomainToValue(Correction domain) {
		return domain.getNativeValue();
	}

	@Override
	public Correction fromValueToDomain(String value) {
		return new CORRECTION(value);
	}

}
