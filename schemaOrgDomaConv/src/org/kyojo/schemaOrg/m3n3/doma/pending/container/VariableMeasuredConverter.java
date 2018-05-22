package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.VARIABLE_MEASURED;
import org.kyojo.schemaOrg.m3n3.pending.Container.VariableMeasured;

@ExternalDomain
public class VariableMeasuredConverter implements DomainConverter<VariableMeasured, String> {

	@Override
	public String fromDomainToValue(VariableMeasured domain) {
		return domain.getNativeValue();
	}

	@Override
	public VariableMeasured fromValueToDomain(String value) {
		return new VARIABLE_MEASURED(value);
	}

}
