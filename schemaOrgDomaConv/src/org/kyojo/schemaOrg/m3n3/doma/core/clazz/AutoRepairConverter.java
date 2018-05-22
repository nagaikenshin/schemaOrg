package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.AUTO_REPAIR;
import org.kyojo.schemaOrg.m3n3.core.Clazz.AutoRepair;

@ExternalDomain
public class AutoRepairConverter implements DomainConverter<AutoRepair, String> {

	@Override
	public String fromDomainToValue(AutoRepair domain) {
		return domain.getNativeValue();
	}

	@Override
	public AutoRepair fromValueToDomain(String value) {
		return new AUTO_REPAIR(value);
	}

}
