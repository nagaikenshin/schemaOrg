package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PROFESSIONAL_SERVICE;
import org.kyojo.schemaorg.m3n4.core.Clazz.ProfessionalService;

@ExternalDomain
public class ProfessionalServiceConverter implements DomainConverter<ProfessionalService, String> {

	@Override
	public String fromDomainToValue(ProfessionalService domain) {
		return domain.getNativeValue();
	}

	@Override
	public ProfessionalService fromValueToDomain(String value) {
		return new PROFESSIONAL_SERVICE(value);
	}

}
