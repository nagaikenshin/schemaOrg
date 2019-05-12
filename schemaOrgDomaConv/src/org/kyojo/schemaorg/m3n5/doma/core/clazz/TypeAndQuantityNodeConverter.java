package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.TYPE_AND_QUANTITY_NODE;
import org.kyojo.schemaorg.m3n5.core.Clazz.TypeAndQuantityNode;

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
