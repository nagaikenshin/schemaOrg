package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TYPE_AND_QUANTITY_NODE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.TypeAndQuantityNode;

@ExternalDomain
public class TypeAndQuantityNodeConverter implements DomainConverter<TypeAndQuantityNode, String> {

	@Override
	public String fromDomainToValue(TypeAndQuantityNode domain) {
		return domain.getNativeValue();
	}

	@Override
	public TypeAndQuantityNode fromValueToDomain(String value) {
		return new TYPE_AND_QUANTITY_NODE(value);
	}

}
