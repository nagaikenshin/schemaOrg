package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PROFESSIONAL_SERVICE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ProfessionalService;

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
