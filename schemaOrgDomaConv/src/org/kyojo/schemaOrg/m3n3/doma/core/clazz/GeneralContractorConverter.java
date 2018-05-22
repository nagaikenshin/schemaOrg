package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.GENERAL_CONTRACTOR;
import org.kyojo.schemaOrg.m3n3.core.Clazz.GeneralContractor;

@ExternalDomain
public class GeneralContractorConverter implements DomainConverter<GeneralContractor, String> {

	@Override
	public String fromDomainToValue(GeneralContractor domain) {
		return domain.getNativeValue();
	}

	@Override
	public GeneralContractor fromValueToDomain(String value) {
		return new GENERAL_CONTRACTOR(value);
	}

}
