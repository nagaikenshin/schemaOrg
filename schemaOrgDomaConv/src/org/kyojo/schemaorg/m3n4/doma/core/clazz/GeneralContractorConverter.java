package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.GENERAL_CONTRACTOR;
import org.kyojo.schemaorg.m3n4.core.Clazz.GeneralContractor;

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